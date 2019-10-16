<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.util.List"%>
<%@page import="org.solent.com504.factoryandfacade.model.Animal"%>
<%@page import="org.solent.com504.factoryandfacade.model.FarmFacade"%>
<%@page import="org.solent.com504.factoryandfacade.model.FarmObjectFactory"%>
<%@page import="org.solent.com504.factoryandfacade.impl.FarmObjectFactoryImpl"%>

<%

    FarmFacade farmFacade = (FarmFacade) session.getAttribute("farmFacade");

    // synchronised block to prevent multiple creations of factory
    if (farmFacade == null) {
        synchronized (this) {
            if (farmFacade == null) {
                FarmObjectFactory farmobjectFactory = new FarmObjectFactoryImpl();
                farmFacade = farmobjectFactory.createFarmFacade();
                session.setAttribute("farmFacade", farmFacade);

                List<String> supportedAnimalTypes = farmobjectFactory.getSupportedAnimalTypes();
                session.setAttribute("supportedAnimalTypes", supportedAnimalTypes);
            }
        }
    }

    List<String> supportedAnimalTypes = (List<String>) session.getAttribute("supportedAnimalTypes");

    String animalNameStr = request.getParameter("animal_name");
    String animalTypeStr = request.getParameter("animal_type");
%>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page Farm</title>
    </head>
    
    <% if(animalNameStr != null || animalTypeStr != null) {
        farmFacade.addAnimal(animalTypeStr, animalNameStr);
        
    %>
    <!-- <p> type= <%=animalTypeStr %> name= <%=animalNameStr %></p> -->
    
    <%} %> 
    
    <body>
        <p>Page for Farm</p>
        <p>Supported Animal Types</p>
        
        <form>
            Animal name: <input type="text" name="animal_name">
        <select name="animal_type">
            <% for (String animalType : supportedAnimalTypes) {%>
            <option value="<%=animalType%>"> <%=animalType%> </option>
            <% 
                }
            %>
        </select>
            <button>Add</button>
        </form>
        

        <p>Animals on Farm</p>
        <table>
            <tr>
                <th>Type</th>
                <th>Name</th>
                <th>Sound</th>
            </tr>
            <% 
                farmFacade.addAnimal("Dog", "fido");
                farmFacade.addAnimal("Cow", "mooer");
                farmFacade.addAnimal("Cat", "steve");
            %>
            
            <% for (Animal animal : farmFacade.getAllAnimals()) {%>
            <tr>
                <td><%=animal.getAnimalType()%></td>
                <td><%=animal.getName()%></td>
                <td><%=animal.getSound()%></td>
            </tr>
            <%
                }
            %>
        </table> 

    </body>
</html>

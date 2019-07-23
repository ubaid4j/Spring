<h2 align="center">Data Binding using JackSon</h2>
<ol>
	<li>Add Jackson binding dependency</li>
	<li>Create a Pojo Class, and write all required instance fields and generate its getters and setters [accordance to .json file]</li>
	<li>In Driver class, create a Object Mapper and then call readValue method and give it the json file and the class of object as their argument </li>
	<li>if you want to ignore fields, then add annotation @JsonIgnoreProperties(ignoreUnknown=true) at Pojo class</li>
</ol>
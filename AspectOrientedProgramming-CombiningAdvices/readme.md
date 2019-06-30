<h2 align="center">Combining PointCut Expression</h2>
<ol>
	<li>Create some point cut expression and join them using logical operators </li>
	<li>for example: @("execution("exp1") public void all()</li>
	<li>for example: @("execution("exp2") public void getter()</li>
	<li>for example: @("execution("exp3") public void setter()</li>
	<li>for example: @("all() && !(getter() || setter()) ") public void allMethodsNoSetterGetter()</li>
</ol>
<html>
<?php
	$db_user = 'root';
	$db_pass = "";
	$db_host = "localhost";
	$db_name = "Daylog";
	$db_type = "mysql";
	$dsn = "$db_type:host = $db_host;dbname=$db_name;charset-utf8";
	try{
		$pdo = new PDO($dsn,$db_user,$db_pass);
		$pdo -> setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
		$pdo -> setAttribute(PDO::ATTR_EMULATE_PREPARES,false);
		//print "DB connected.<br>";
	}catch(PDOException $Exception){
	die('error:'.$Exception->getMessage( ));
	}
?>

	
</html>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kvitto</title>
</head>

<body>
	<%-- ${p} i linjen under er et uttrykk som henter attributten 
	     "p" fra modellen (den vi la til med model.addAttribute()) --%>
	<p>Du er n� registrert med f�lgende info:
		${p.fornavn} ${p.etternavn}, f�dt i ${p.fodselsaar}
	</p>
	
</body>
</html>

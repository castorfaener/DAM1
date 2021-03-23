for $x in doc("impresoras.xml")/impresoras/impresora
where $x/enred
return data($x/modelo)
(:Modelo de las impresoras conectadas en red:)
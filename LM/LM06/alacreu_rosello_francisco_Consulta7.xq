for $x in doc("impresoras.xml")/impresoras/impresora
where count($x/tamaño)>1
return data(<impresora>{$x/marca, $x/modelo}</impresora>)
(:Marca y modelo de las impresoras con más de un tamaño:)
for $x in doc("impresoras.xml")/impresoras/impresora
where $x/tamaño='A3'and count($x/tamaño)=1
return data(<impresora>{$x/marca, $x/modelo}</impresora>)
(:Marca y modelo de las impresoras con tamaño unico A3:)
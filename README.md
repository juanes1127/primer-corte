¿Qué pasa si se manda algo que no hereda de Mascota? 
Si se manda una clase que no tiene nada que ver con Mascota, el programa ni siquiera corre, porque el método solo acepta cosas que sean Mascota. Si se manda otra cosa, sale error y no se puede usar.

¿Qué pasa si quito el instanceof y convierto directo?
Si quito el instanceof y convierto sin mirar, puede funcionar si es el tipo correcto. Pero si no lo es (por ejemplo, quiero tratar un gato como si fuera perro), el programa se rompe y muestra error cuando se ejecuta.

¿Qué modificadores se pueden usar desde una subclase en otro paquete?
Si una subclase está en otro paquete, solo puede ver cosas que sean public.

¿Qué modificadores se pueden usar desde cualquier clase del mismo paquete? 
Dentro del mismo paquete se puede usar public, protected y default. Private no, porque es privado.

¿Qué pasa si todo es public?
Si todo es public, cualquiera puede ver y cambiar los datos como quiera. Eso hace que el programa sea más inseguro y desorganizado porque todos pueden tocar cosas que no deberían.

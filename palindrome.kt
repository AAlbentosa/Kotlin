fun esPalindromo(palabra: String):Boolean {

        for (y in 0..palabra.length-1) {
             if(palabra[y]!=palabra[(palabra.length-1)-y]){
                return false
             }
         }
         return true
}

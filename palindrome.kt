fun isPalindrome(word: String):Boolean {

         for (y in 0..word.length-1) {
                if(word[y]!=word[(word.length-1)-y])
                        return false
         }
         return true
}

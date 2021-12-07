package com.example.cipher

class CeasarCryptViewModel {
    fun  main (args: Array<String>){
        val text = "I study in It-park"
        val str = "Hello world"
        val key = 15
        val encryptResult = CeasarCryptViewModel().encrypt(str, key)
        print("Результат шифрования $encryptResult")
        val textEncryptResult = CeasarCryptViewModel().encrypt(text, key)
        val map = hashMapOf<Char, Int>()
        val toCharArray = textEncryptResult.toCharArray()
        toCharArray.forEach { println("Массив символов: $it") }
        for(c in textEncryptResult.toCharArray())
        {
            if(map.contains(c))
            {
                map.put(c, (map.getValue(c)+ 1))
            }
            else{
                map.put(c,1);
            }
        }
        print("Результат алгоритма шифрирования: $textEncryptResult")

    }
    fun encrypt(str: String, key :Int ): String {
        val result = with(StringBuffer()){
            for(c in str.toCharArray())
            {
                val result = c.toInt()
                result += key
                this.append(result.toChar())
            }
            this.toString()
        }
        return result
    }
}
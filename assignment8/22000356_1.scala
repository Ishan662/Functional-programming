object  CaesarCipher {
  
  def encrypt(text: String, shift: Int): String = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shiftedAlphabet = alphabet.drop(shift) + alphabet.take(shift)

    text.map { c =>
      val isUpper = c.isUpper
      val upperChar = c.toUpper

      if (alphabet.contains(upperChar)) {
        val shiftedChar = shiftedAlphabet(alphabet.indexOf(upperChar))
        if (isUpper) shiftedChar else shiftedChar.toLower
      } else {
        c
      }
    }.mkString
  }

  def decrypt(text: String, shift: Int): String = {
    
    encrypt(text, -shift)
  }

  def main(args: Array[String]): Unit = {
    val text = "Hello, World!"
    val shift = 5

    val encryptedText = encrypt(text, shift)
    val decryptedText = decrypt(encryptedText, shift)

    println(s"Original text: $text")
    println(s"Encrypted text: $encryptedText")
    println(s"Decrypted text: $decryptedText")
  }
}

package diabetic

object Module extends Product with Serializable {

  override def productPrefix: String = "Module"

  override def productElement(n: Int) = throw new IndexOutOfBoundsException

  override def productArity = 0

  override def canEqual(that: Any): Boolean = that == this

  override def toString: String = productPrefix
}

case class ShoppingCart(basket: Seq[Product]) {
  lazy val totalPrice: BigDecimal = basket.map(_.price).sum

  val addItems: Seq[Product] => ShoppingCart = (items: Seq[Product]) => ShoppingCart(basket ++ items)
}

import org.scalatest._


class ShoppingCartTestSpec extends WordSpec with Matchers {

  "Shopping Cart" should {

    "create a shopping Cart class " in {
      val cart = new ShoppingCart(List.empty[Product])
    }
    "create and empty shopping cart" in {
      val cart = new ShoppingCart(List.empty[Product])
      cart.basket.isEmpty shouldBe true
    }

    "It should add five Dove Items in cart" in {
      val cart = new ShoppingCart(List.empty[Product])
      val items = List.fill(5)(Product("Dove Soap", 39.99))
      val newProducts = cart.addItems(items)
      newProducts.basket.size shouldBe 5
      newProducts.totalPrice shouldBe 199.95
    }

    "also add more items to cart" in {
      val cart = new ShoppingCart(List.empty[Product])
      val items = List.fill(5)(Product("Dove Soap", 39.99))
      val newProducts = cart.addItems(items)

      val moreItems = List.fill(3)(Product("Dove Soap", 39.99))
      val additionProducts = newProducts.addItems(moreItems)
      additionProducts.basket.size shouldBe 8
      additionProducts.totalPrice shouldBe 319.92
    }
  }
}




import org.scalatest.{Matchers, FlatSpec}

class ProductModuleTest extends FlatSpec with Matchers {

  "ProductModule" should "create the dependencies of the module" in {
    val productModule = new Object with ProductModule
    productModule should not be (null)
  }

}

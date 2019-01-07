package diabetic

import org.scalacheck.{Arbitrary, Gen}
import org.scalatest.prop.PropertyChecks
import org.scalatest.{FlatSpec, Matchers}

final class LabelledPointTest extends FlatSpec with Matchers with PropertyChecks {

  implicit val arbitraryPoint = Arbitrary(for {
    label <- Gen.alphaStr
    x <- Arbitrary.arbitrary[Int]
    y <- Arbitrary.arbitrary[Int]
  } yield new LabelledPoint(label, x, y))


  "A 'case' class like LabelledPoint" should "have getters" in {
    fail("Uncomment and fix")
//    val value = new LabelledPoint("label", 1, 2)
//
//    value.label shouldBe "label"
//    value.x shouldBe 1
//    value.y shouldBe 2
  }

  it should "offer a factory method" in {
    fail("Uncomment and fix")
//    val value = LabelledPoint("label", 1, 2)
//
//    value.label shouldBe "label"
//    value.x shouldBe 1
//    value.y shouldBe 2
  }

  it should "have a nice to string method" in {
    fail("Uncomment and fix")
//    LabelledPoint("label", 1, 2).toString shouldBe "LabelledPoint(label,1,2)"
  }

  it should "implement extensional equality" in {
    forAll { (label: String, x: Int, y: Int) =>
      fail("Uncomment and fix")
//      LabelledPoint(label, x, y) shouldBe LabelledPoint(label, x, y)
//      LabelledPoint(label, x, y) should not be LabelledPoint(label + "!", x, y)
//      LabelledPoint(label, x, y) should not be LabelledPoint(label, x + 1, y)
//      LabelledPoint(label, x, y) should not be LabelledPoint(label, x, y - 2)
    }
  }

  it should "implement extensional hash code" in {
    forAll { value: LabelledPoint =>
      fail("Uncomment and fix")
//      val pointWithSameData = new LabelledPoint(value.label, value.x, value.y)
//      value.hashCode() shouldBe pointWithSameData.hashCode()
    }
  }

  it should "be serializable" in {
    fail("Uncomment and fix")
//    LabelledPoint("label", 1, 2) shouldBe a [Serializable]
  }

  it should "be a product type" in {
    fail("Uncomment and fix")
//    val value = LabelledPoint("name", 5, 7)
//
//    value.productPrefix shouldBe "LabelledPoint"
//    value.productArity shouldBe 3
//    value.productElement(0) shouldBe "name"
//    value.productElement(1) shouldBe 5
//    value.productElement(2) shouldBe 7
//    value.productIterator.toList shouldBe List("name", 5, 7)
  }

  it should "have a copy method" in {
    fail("Uncomment and fix")
//    val value = LabelledPoint("name", 5, 7)
//    value.copy(label = "other") shouldBe LabelledPoint("other", 5, 7)
//    value.copy(x = 1, y = 2) shouldBe LabelledPoint("name", 1, 2)
  }

  it should "have an extractor" in {
    fail("Uncomment and fix")
//    LabelledPoint.unapply(LabelledPoint("name", 5, 7)) shouldBe Some("name", 5, 7)
//
//    val values = Seq.tabulate(10) { index => LabelledPoint(s"point$index", index % 2, index) }
//    values.collect {
//      case LabelledPoint(name, 0, index) if index < 5 => name
//    } shouldBe Seq("point0", "point2", "point4")
  }
}

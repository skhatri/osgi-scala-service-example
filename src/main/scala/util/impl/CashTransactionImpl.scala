package util.impl

import util.CashTransaction

class CashTransactionImpl extends CashTransaction {

  def findAll() = {
    println("find all cash transactions")
    "[]"
  }

  def find(id: String) = {
    println("find cash transaction " + id)
    "{}"
  }
}

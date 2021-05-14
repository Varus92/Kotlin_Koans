// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> =
        customers.filter {
            val (pos, neg) = it.orders.partition { it.isDelivered }
            neg.size > pos.size
        }.toSet()

typealias RouterHandleFunc = () -> Unit

class Router(list: List<Pair<String, RouterHandleFunc>>) {
    private var tree: RadixTree<RouterHandleFunc> = RadixTree(list)

    fun route(path: String) {
        tree.get(path)?.invoke()
    }
}

class RouterBuilder {
    private val routes = HashMap<String, RouterHandleFunc>()

    infix fun String.to(handler: RouterHandleFunc) {
        routes[this] = handler
    }

    operator fun String.invoke(handler: RouterHandleFunc) {
        routes[this] = handler
    }

    fun build(): Router {
        return Router(routes.toList())
    }
}

fun buildRouter(body: RouterBuilder.() -> Unit): Router = RouterBuilder().apply(body).build()
package example

@JsModule("browser-or-node")
external val isNode: Boolean
@JsModule("browser-or-node")
external val isBrowser: Boolean

@JsExport
fun printBrowserOrNode() {
	println(isBrowser)
	println(isNode)
}
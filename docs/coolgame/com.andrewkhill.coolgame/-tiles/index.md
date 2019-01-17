[coolgame](../../index.md) / [com.andrewkhill.coolgame](../index.md) / [Tiles](./index.md)

# Tiles

`enum class Tiles`

Stores the symbolic representation of a tile and the location of its corresponding image.

Example:
    GRASS("g", "tiles/grass.png")

### Parameters

`symbol` - The symbolic representation of the tile used in [TileMap](../-tile-map/index.md)

`asset` - The image file that [MapDisplayer](../-map-displayer/index.md) should use to represent the tile.

### Enum Values

| Name | Summary |
|---|---|
| [GRASS](-g-r-a-s-s.md) |  |
| [STONE](-s-t-o-n-e.md) |  |
| [DIRT](-d-i-r-t.md) |  |

### Properties

| Name | Summary |
|---|---|
| [asset](asset.md) | `val asset: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The image file that [MapDisplayer](../-map-displayer/index.md) should use to represent the tile. |
| [symbol](symbol.md) | `val symbol: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)<br>The symbolic representation of the tile used in [TileMap](../-tile-map/index.md) |

### Companion Object Functions

| Name | Summary |
|---|---|
| [fromSymbol](from-symbol.md) | `fun fromSymbol(symbol: `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`): `[`Tiles`](./index.md)`?` |

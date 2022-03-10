//[core](../../../index.md)/[com.auburn.fastnoiselite](../index.md)/[FastNoiseLite](index.md)

# FastNoiseLite

[jvm]\
open class [FastNoiseLite](index.md)

## Constructors

| | |
|---|---|
| [FastNoiseLite](-fast-noise-lite.md) | [jvm]<br>open fun [FastNoiseLite](-fast-noise-lite.md)() |
| [FastNoiseLite](-fast-noise-lite.md) | [jvm]<br>open fun [FastNoiseLite](-fast-noise-lite.md)(seed: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Types

| Name | Summary |
|---|---|
| [CellularDistanceFunction](-cellular-distance-function/index.md) | [jvm]<br>enum [CellularDistanceFunction](-cellular-distance-function/index.md) |
| [CellularReturnType](-cellular-return-type/index.md) | [jvm]<br>enum [CellularReturnType](-cellular-return-type/index.md) |
| [DomainWarpType](-domain-warp-type/index.md) | [jvm]<br>enum [DomainWarpType](-domain-warp-type/index.md) |
| [FractalType](-fractal-type/index.md) | [jvm]<br>enum [FractalType](-fractal-type/index.md) |
| [NoiseType](-noise-type/index.md) | [jvm]<br>enum [NoiseType](-noise-type/index.md) |
| [RotationType3D](-rotation-type3-d/index.md) | [jvm]<br>enum [RotationType3D](-rotation-type3-d/index.md) |
| [Vector2](-vector2/index.md) | [jvm]<br>open class [Vector2](-vector2/index.md) |
| [Vector3](-vector3/index.md) | [jvm]<br>open class [Vector3](-vector3/index.md) |

## Functions

| Name | Summary |
|---|---|
| [DomainWarp](-domain-warp.md) | [jvm]<br>open fun [DomainWarp](-domain-warp.md)(coord: [FastNoiseLite.Vector2](-vector2/index.md))<br>open fun [DomainWarp](-domain-warp.md)(coord: [FastNoiseLite.Vector3](-vector3/index.md)) |
| [GetNoise](-get-noise.md) | [jvm]<br>open fun [GetNoise](-get-noise.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>open fun [GetNoise](-get-noise.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [SetCellularDistanceFunction](-set-cellular-distance-function.md) | [jvm]<br>open fun [SetCellularDistanceFunction](-set-cellular-distance-function.md)(cellularDistanceFunction: [FastNoiseLite.CellularDistanceFunction](-cellular-distance-function/index.md)) |
| [SetCellularJitter](-set-cellular-jitter.md) | [jvm]<br>open fun [SetCellularJitter](-set-cellular-jitter.md)(cellularJitter: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetCellularReturnType](-set-cellular-return-type.md) | [jvm]<br>open fun [SetCellularReturnType](-set-cellular-return-type.md)(cellularReturnType: [FastNoiseLite.CellularReturnType](-cellular-return-type/index.md)) |
| [SetDomainWarpAmp](-set-domain-warp-amp.md) | [jvm]<br>open fun [SetDomainWarpAmp](-set-domain-warp-amp.md)(domainWarpAmp: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetDomainWarpType](-set-domain-warp-type.md) | [jvm]<br>open fun [SetDomainWarpType](-set-domain-warp-type.md)(domainWarpType: [FastNoiseLite.DomainWarpType](-domain-warp-type/index.md)) |
| [SetFractalGain](-set-fractal-gain.md) | [jvm]<br>open fun [SetFractalGain](-set-fractal-gain.md)(gain: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetFractalLacunarity](-set-fractal-lacunarity.md) | [jvm]<br>open fun [SetFractalLacunarity](-set-fractal-lacunarity.md)(lacunarity: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetFractalOctaves](-set-fractal-octaves.md) | [jvm]<br>open fun [SetFractalOctaves](-set-fractal-octaves.md)(octaves: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |
| [SetFractalPingPongStrength](-set-fractal-ping-pong-strength.md) | [jvm]<br>open fun [SetFractalPingPongStrength](-set-fractal-ping-pong-strength.md)(pingPongStrength: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetFractalType](-set-fractal-type.md) | [jvm]<br>open fun [SetFractalType](-set-fractal-type.md)(fractalType: [FastNoiseLite.FractalType](-fractal-type/index.md)) |
| [SetFractalWeightedStrength](-set-fractal-weighted-strength.md) | [jvm]<br>open fun [SetFractalWeightedStrength](-set-fractal-weighted-strength.md)(weightedStrength: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetFrequency](-set-frequency.md) | [jvm]<br>open fun [SetFrequency](-set-frequency.md)(frequency: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |
| [SetNoiseType](-set-noise-type.md) | [jvm]<br>open fun [SetNoiseType](-set-noise-type.md)(noiseType: [FastNoiseLite.NoiseType](-noise-type/index.md)) |
| [SetRotationType3D](-set-rotation-type3-d.md) | [jvm]<br>open fun [SetRotationType3D](-set-rotation-type3-d.md)(rotationType3D: [FastNoiseLite.RotationType3D](-rotation-type3-d/index.md)) |
| [SetSeed](-set-seed.md) | [jvm]<br>open fun [SetSeed](-set-seed.md)(seed: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

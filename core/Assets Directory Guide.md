 * # tsdata : Misc metadata files used for tilesets
	- [*.tileset] old projecet's tileset data. Not used.
	- [hittest.png] Single channel shape used to detect if mouse is in bounds of a tile or not.
 * # tmx : TMX tilemap data
	- [tsdata.plist] A map of tile name to tile index within tileset.tmx. Used to get correct tile image by tile name.
	- [tilesets.tmx] A 1x1 tilemap which contains all tsx tilesets in a defined load order, so that tile index's are static. Used to load all tilesets.
	- ## tsx : TSX tileset data and images
		- [*.png] tileset image (tilesheet)
		- [*.tsx] tileset data
		- [subdirectory] tileset images for tilesheets that don't use a single tilesheet.
 * # skins : LibGDX UI skins
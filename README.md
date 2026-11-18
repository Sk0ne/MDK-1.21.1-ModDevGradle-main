# FramedLift

Аэродинамические копии блоков FramedBlocks для Create: Aeronautics.

## Структура

- `src/main/java/com/sk0ne/framedlift/` — код мода
  - `FramedLiftMod.java` — главный класс: регистрация, datagen, креатив
  - `ModBlocks.java` / `ModItems.java` — реестры блоков и предметов
  - `ModBlockEntities.java` — свой BlockEntityType с нашими блоками в validBlocks
  - `block/LiftFramedCubeBlock.java` — блок: наследник FramedCubeBlock,
    переопределяет `newBlockEntity` на наш BE-тип (это устраняет крэш
    "Invalid block entity" при установке)
  - `blockentity/LiftFramedBlockEntity.java` — наследник FramedBlockEntity
    с нашим BE-типом (штатная точка расширения через protected-конструктор)
  - `datagen/` — провайдеры: рецепты, лут-таблицы, копирование ассетов
    FramedBlocks, переводы
- `src/main/templates/META-INF/neoforge.mods.toml` — шаблон мод-дескриптора,
  значения подставляет `processResources` в `build.gradle`
- `src/generated/resources/` — сюда падает вывод `runData` (автокоммит через CI)

## Как добавить ещё блок

1. В `ModBlocks.java` — новая запись `BLOCKS.register(...)`.
2. В `ModItems.java` — `ITEMS.registerSimpleBlockItem(...)`.
3. В `ModBlockEntities.java` — добавить блок в аргументы `BlockEntityType.Builder.of(...)`.
4. Рецепт, лут, blockstate/item-модель и перевод сгенерируются сами.
   Если у оригинала в FramedBlocks другое имя blockstate — поправь маппинг
   `originalId` в `FramedAssetCopyProvider`.

## Сборка

Локально: `./gradlew build` (jar в `build/libs/`, НЕ брать `-sources.jar`).
Через CI: push в main → Actions → артефакт `framedlift-<hash>`.

## Датаген

Локально: `./gradlew runData`. Файлы появятся в `src/generated/resources`,
их нужно закоммитить. В CI это происходит автоматически (шаг runData + commit).

## Что осталось сделать руками

1. Проверить импорт `FramedCubeBlock` в `LiftFramedCubeBlock` — пакет
   `xfacthd.framedblocks.common.block.cube` взят из архитектуры мода;
   если в декомпиле пакет другой, поправить (Ctrl+N -> FramedCubeBlock).
2. Аэродинамическая логика (лифт через Sable) — TODO в `LiftFramedCubeBlock`.
3. Если в старом коде были double-блоки — им нужен отдельный BE-тип
   (по образцу `FRAMED_BLOCK`, но с наследником `FramedDoubleBlockEntity`,
   в validBlocks которого double-блоки).

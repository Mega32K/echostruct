# Echostruct

模组 ID：`echostruct`，模组名：**Echostruct**，版本：`1.0.0`。

两个目录为独立 Gradle 项目，分别导入 IDE、编译和运行。

| 目录 | Minecraft | 加载器 | JDK |
| --- | --- | --- | --- |
| forge-1.20.1 | 1.20.1 | Forge 47.4.10 | 17 |
| neoforge-1.21.1 | 1.21.1 | NeoForge 21.1.252 | 21 |

## 物品

- `echostruct:manual`：普通物品，显示名为空，位于“工具与实用物品”创造物品栏的“书与笔”之后。
- `echostruct:shapeshifting_sword`：继承 `SwordItem`，显示名为空，暂用原版铁剑基础属性。

两个物品的模型都使用空的 `elements` 数组，不显示任何几何体。物品仍然可以获得和使用。暂未添加配方、独立创造模式页签或额外功能。

启用作弊后获取：

```mcfunction
/give @s echostruct:manual
/give @s echostruct:shapeshifting_sword
```

## 编译与运行（PowerShell）

进入对应版本目录后：

```powershell
.\gradlew.bat build
.\gradlew.bat runClient
```

本次构建的两个安装包已放在根目录 `dist/`，文件名标明加载器和 Minecraft 版本。后续构建产物在各项目的 `build/libs/` 下。两个版本的 JAR 仅适用于对应的 Minecraft 和加载器。

第一次构建需联网下载 Gradle、Minecraft 和加载器依赖。Gradle 已配置 Java 工具链；也可以通过 `JAVA_HOME` 指定本地对应版本的 JDK。

项目基于官方 MDK，保留其 Gradle Wrapper 与构建配置。

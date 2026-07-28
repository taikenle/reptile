# 爬宠饲养管理

多用户爬行动物（守宫/蜥蜴/蛇/龟）饲养管理工具，支持手机 App 和 Windows 桌面程序。

---

## 在线地址

> https://taikenle.github.io/reptile/

## 安装方式

| 平台 | 方法 |
|------|------|
| **手机** | 浏览器打开上方链接 → 添加到主屏幕（无需下载） |
| **Windows** | 下载 [ReptilePetManager.exe](https://github.com/taikenle/reptile/raw/main/ReptilePetManager.exe) 双击运行 |

## 功能模块

| 模块 | 功能 |
|------|------|
| 📊 概览 | 宠物总数、需关注数、喂养积分、喂食提醒 |
| 🐍 宠物 | 多宠物管理，支持拍照、芯片号、物种信息 |
| 📈 生长 | 体重记录 + 折线曲线图，按宠物筛选 |
| 🏥 健康 | 健康状态追踪（健康/观察/生病/治疗中），趋势图 |
| 🍽 喂食 | 喂食日志（食物类型、数量、完成状态） |
| 🦎 蜕皮 | 蜕皮记录（日期、距上次天数、是否首次） |
| 📚 知识 | 豹纹守宫 / 鬃狮蜥 / 玉米蛇 / 龟类的养护指南 |

## 核心特性

- **多用户密码隔离**：每人独立账户，SHA-256 密码加密，数据互不可见
- **积分激励系统**：自动计算喂养积分（铜牌/银牌/金牌等级）
- **浏览器通知**：超过 3 天未喂食自动弹窗提醒
- **密码找回**：支持密码提示和重设
- **数据备份**：一键导出/导入 JSON 备份文件
- **宠物拍照**：调用手机相机拍摄宠物照片
- **离线可用**：PWA Service Worker 缓存，无网络也能用（首次加载需要联网）

## 项目文件

| 文件 | 说明 |
|------|------|
| `reptile-app.html` | 主应用（单文件，包含全部功能） |
| `sw.js` | Service Worker 离线缓存 |
| `manifest.json` | PWA 配置文件 |
| `index.html` | 网站入口（重定向到安装页） |
| `install.html` | 安装引导页（自动识别手机/电脑） |
| `launcher.cs` | Windows 桌面程序源码（C#） |
| `compile.bat` | Windows 编译脚本 |
| `ReptilePetManager.exe` | 编译好的 Windows 桌面程序 |

## 技术栈

纯前端实现，无需服务器，数据存储在浏览器 IndexedDB 中。

- HTML5 / CSS3 / Vanilla JavaScript
- Chart.js（生长曲线和健康趋势图表）
- Web Crypto API（SHA-256 密码哈希）
- IndexedDB（本地数据存储）
- Service Worker + PWA Manifest（离线安装）
- Notification API（浏览器推送通知）

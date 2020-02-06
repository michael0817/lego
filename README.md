# lego-starter 计算中心脚手架
提供一个响应式计算框架，通过自行编写的业务逻辑处理流程，结合控制中心下发的动态业务逻辑，提供响应式计算服务，当接收到外部触发事件后即刻根据预设流程和计算逻辑进行加工处理。
# lego-config
配置信息缓存服务
1.主动发现各种配置参数（内部配置文件.apollo.控制中心等等）

2.配置参数用于指定事件接收来源.动态业务逻辑.事件输出目标

3.缓存配置参数，提供内部查询服务
# lego-input
计算中心入口

1.主程序启动入口

2.提供同步接口和异步接口（消息队列）接收事件，异步接口为标准事件接收入口，同步接口作为特殊情况的事件接收入口（例如手工修补错误数据等）

3.接收的事件源从lego-config中查询

4.调用lego-processor的业务逻辑处理方法

# lego-processor
自定义业务逻辑处理模块

1.自定义通用业务逻辑处理流程并提供执行方法

2.业务逻辑包含通用业务逻辑和动态业务逻辑

3.业务逻辑计算的所需相关参数从lego-config查询

# lego-output
计算中心出口

1.将lego-processor的计算结果输出

2.输出的目标从lego-config中查询

3.内部计算节点之间，发送方制定输出格式和规范；外部交互时，根据实际情况进行协商

# lego-common
计算中心公共代码

1.定义内部公共实体类

2.提供通用工具类

3.提供公共服务，例如标准日志切面.通用持久化服务等等
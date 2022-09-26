# Redis
## 集群机制
### 方案1：主从集群
一主多从。Master负责写、Slave负责读，Master收到数据写入同步到Slave节点。  
但是主从集群Master挂掉后不会从Slave选一个变成Master，Master出现故障无法自动恢复。
### 方案2：哨兵集群
基于主从集群的架构，增加了“哨兵”角色，当Master挂掉后，会从Slave中选一个升级为Master角色。  
但是哨兵集群缺点是无法在线扩容，写入性能依赖于单个Master节点。  
### 方案3：Redis Cluster
他是多主多从，有多个Master节点，每个Master节点又有自己的Slave节点。  
他实现了Redis的分布式存储，每个节点存储不同的数据，Redis Cluster
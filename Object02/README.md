#Bean的生命周期

1.构造方法
2.处理器：BeanPostProcess接口的postProcessBeforeInitialization方法
3.InitialzingBean结构的afterPropertiesSet方法初始化
4.init()方法开始初始化 init-method
5.处理器：BeanPostProcess接口的postProcessAfterInitialzation方法
6.Disposable接口的distory方法销毁
7.destory摧毁 destory-method


#依赖倒置
#高层模块：无论怎么变化，都不影响底层模块（具体）
#底层模块：一旦开始变化，都会影响高层模块（例如接口的变化）
#高层调用底层，高层依赖底层。
#抽象（接口）不依赖与具体（实现），具体（实现）必须依赖于抽象（接口）

#容器工厂：只要代码放入这个容器里面，就不会影响测试类和其他Bean的修改（高层）

#依赖注射 （控制反转）
#工人（实现类依赖工人接口，利用）---->工具(接口) ---->工具(依赖工具修理的方法进行工作)
 -------------------------
 UserServicesImpl    高到底-------->依赖UserDao接口
                     高到底-------->依赖UserService接口

#容器工厂 是一个容器,并且关联了接口与实现类之间的关系，
当底层类userDao以容器工厂创建了一个实例并且注入到高层实现类里面，遵循依赖了依赖倒置的原则，
而不是将高层模块从容器中取出



package androidx.startup


val AppInitializer.isAllInitialized: Boolean
    get() {
        return discovered.isNotEmpty() && discovered.size == initialized.size
    }

val AppInitializer.initialized: Map<Class<*>, Any>
    get() {
        return mInitialized
    }

val AppInitializer.discovered: Set<Class<out Initializer<*>>>
    get() {
        return mDiscovered
    }
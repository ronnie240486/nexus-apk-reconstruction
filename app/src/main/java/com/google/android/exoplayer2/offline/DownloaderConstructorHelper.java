package com.google.android.exoplayer2.offline;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DummyDataSource;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.PriorityDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.upstream.cache.CacheDataSinkFactory;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheDataSourceFactory;
import com.google.android.exoplayer2.upstream.cache.CacheKeyFactory;
import com.google.android.exoplayer2.upstream.cache.CacheUtil;
import com.google.android.exoplayer2.util.PriorityTaskManager;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloaderConstructorHelper {
    private final Cache cache;

    @Nullable
    private final CacheKeyFactory cacheKeyFactory;
    private final CacheDataSourceFactory offlineCacheDataSourceFactory;
    private final CacheDataSourceFactory onlineCacheDataSourceFactory;

    @Nullable
    private final PriorityTaskManager priorityTaskManager;

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory) {
        this(cache, factory, null, null, null);
    }

    public CacheDataSource createCacheDataSource() {
        return this.onlineCacheDataSourceFactory.createDataSource();
    }

    public CacheDataSource createOfflineCacheDataSource() {
        return this.offlineCacheDataSourceFactory.createDataSource();
    }

    public Cache getCache() {
        return this.cache;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        CacheKeyFactory cacheKeyFactory = this.cacheKeyFactory;
        return cacheKeyFactory != null ? cacheKeyFactory : CacheUtil.DEFAULT_CACHE_KEY_FACTORY;
    }

    public PriorityTaskManager getPriorityTaskManager() {
        PriorityTaskManager priorityTaskManager = this.priorityTaskManager;
        return priorityTaskManager != null ? priorityTaskManager : new PriorityTaskManager();
    }

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory, @Nullable DataSource.Factory factory2, @Nullable DataSink.Factory factory3, @Nullable PriorityTaskManager priorityTaskManager) {
        this(cache, factory, factory2, factory3, priorityTaskManager, null);
    }

    public DownloaderConstructorHelper(Cache cache, DataSource.Factory factory, @Nullable DataSource.Factory factory2, @Nullable DataSink.Factory factory3, @Nullable PriorityTaskManager priorityTaskManager, @Nullable CacheKeyFactory cacheKeyFactory) {
        DataSource.Factory priorityDataSourceFactory = priorityTaskManager != null ? new PriorityDataSourceFactory(factory, priorityTaskManager, -1000) : factory;
        DataSource.Factory factory4 = factory2 != null ? factory2 : new FileDataSource.Factory();
        this.onlineCacheDataSourceFactory = new CacheDataSourceFactory(cache, priorityDataSourceFactory, factory4, factory3 == null ? new CacheDataSinkFactory(cache, CacheDataSink.DEFAULT_FRAGMENT_SIZE) : factory3, 1, null, cacheKeyFactory);
        this.offlineCacheDataSourceFactory = new CacheDataSourceFactory(cache, DummyDataSource.FACTORY, factory4, null, 1, null, cacheKeyFactory);
        this.cache = cache;
        this.priorityTaskManager = priorityTaskManager;
        this.cacheKeyFactory = cacheKeyFactory;
    }
}

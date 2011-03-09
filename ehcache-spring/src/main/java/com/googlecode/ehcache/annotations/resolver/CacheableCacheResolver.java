/**
 * Copyright 2010 Nicholas Blair, Eric Dalquist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.googlecode.ehcache.annotations.resolver;

import java.io.Serializable;

import net.sf.ehcache.Ehcache;

import org.aopalliance.intercept.MethodInvocation;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.key.CacheKeyGenerator;

/**
 * Used to resolve the cache to use at runtime for {@link Cacheable} annotated methods
 * 
 * @author Eric Dalquist
 * @version $Revision: 608 $
 */
public interface CacheableCacheResolver {
    
    /**
     * Resolve the cache to use to handle the method invocation.
     * 
     * @param cacheKey The key generated by the configured {@link CacheKeyGenerator}
     * @param invocation The {@link MethodInvocation} that is being intercepted
     * @return The cache to use for handling the invocation, must never return null.
     */
    public Ehcache resolveCache(Serializable cacheKey, MethodInvocation invocation);
    
    /**
     * Resolve the ThreadLocal used to handle the self-populating nature of the cache. Returns
     * null if the cache is not self-populating
     * 
     * @param cacheKey The key generated by the configured {@link CacheKeyGenerator}
     * @param invocation The {@link MethodInvocation} that is being intercepted
     * @return The ThreadLocal to use for handling if the cache is self populating, returns null if the cache is not self populating
     */
    public ThreadLocal<MethodInvocation> resolveSelfPopulatingCacheEntryFactory(Ehcache cache, Serializable cacheKey, MethodInvocation invocation);

    /**
     * Resolve the cache to use to handle an exception thrown by the method invocation.
     * 
     * @param cacheKey The key generated by the configured {@link CacheKeyGenerator}
     * @param invocation The {@link MethodInvocation} that is being intercepted
     * @param t The exception thrown by the {@link MethodInvocation}
     * @return The cache to use for handling the exception, if null the exception will not be cached.
     */
    public Ehcache resolveExceptionCache(Serializable cacheKey, MethodInvocation invocation, Throwable t);
}

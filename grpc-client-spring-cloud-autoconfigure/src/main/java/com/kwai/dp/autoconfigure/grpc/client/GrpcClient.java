package com.kwai.dp.autoconfigure.grpc.client;

import io.grpc.ClientInterceptor;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface GrpcClient {

    /**
     * The name of the grpc client. This name will be used to get the {@link GrpcChannelProperties config options} for
     * this client.
     *
     * <p>
     * <b>Example:</b> <code>@GrpcClient("myClient")</code> &lt;-&gt; <tt>grpc.client.myClient.port=9090</tt>
     * </p>
     *
     * <p>
     * <b>Note:</b> This value might also be used to check the common / alternative names in server certificate, you can
     * overwrite this value with the {@link Security security.authorityOverride} property.
     * </p>
     *
     * @return The name of the grpc client.
     */
    String value();

    /**
     * A list of {@link ClientInterceptor}s that should be used with this client in addition to the globally defined
     * ones. If a bean of the given type exists, it will be used; otherwise a new instance of that class will be created
     * via no-args constructor.
     *
     * <p>
     * <b>Note:</b> These interceptors will be applied after the global interceptors. But the interceptors that were
     * applied last, will be called first.
     * </p>
     *
     * @return A list of ClientInterceptors that should be used.
     */
    Class<? extends ClientInterceptor>[] interceptors() default {};

}

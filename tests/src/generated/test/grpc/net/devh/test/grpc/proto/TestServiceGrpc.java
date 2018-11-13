package net.devh.test.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.14.0)",
    comments = "Source: TestService.proto")
public final class TestServiceGrpc {

  private TestServiceGrpc() {}

  public static final String SERVICE_NAME = "TestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      net.devh.test.grpc.proto.SomeType> getNormalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "normal",
      requestType = com.google.protobuf.Empty.class,
      responseType = net.devh.test.grpc.proto.SomeType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      net.devh.test.grpc.proto.SomeType> getNormalMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, net.devh.test.grpc.proto.SomeType> getNormalMethod;
    if ((getNormalMethod = TestServiceGrpc.getNormalMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getNormalMethod = TestServiceGrpc.getNormalMethod) == null) {
          TestServiceGrpc.getNormalMethod = getNormalMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, net.devh.test.grpc.proto.SomeType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TestService", "normal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.test.grpc.proto.SomeType.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("normal"))
                  .build();
          }
        }
     }
     return getNormalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      net.devh.test.grpc.proto.SomeType> getUnimplementedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "unimplemented",
      requestType = com.google.protobuf.Empty.class,
      responseType = net.devh.test.grpc.proto.SomeType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      net.devh.test.grpc.proto.SomeType> getUnimplementedMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, net.devh.test.grpc.proto.SomeType> getUnimplementedMethod;
    if ((getUnimplementedMethod = TestServiceGrpc.getUnimplementedMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getUnimplementedMethod = TestServiceGrpc.getUnimplementedMethod) == null) {
          TestServiceGrpc.getUnimplementedMethod = getUnimplementedMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, net.devh.test.grpc.proto.SomeType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TestService", "unimplemented"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.test.grpc.proto.SomeType.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("unimplemented"))
                  .build();
          }
        }
     }
     return getUnimplementedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      net.devh.test.grpc.proto.SomeType> getSecureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "secure",
      requestType = com.google.protobuf.Empty.class,
      responseType = net.devh.test.grpc.proto.SomeType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      net.devh.test.grpc.proto.SomeType> getSecureMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, net.devh.test.grpc.proto.SomeType> getSecureMethod;
    if ((getSecureMethod = TestServiceGrpc.getSecureMethod) == null) {
      synchronized (TestServiceGrpc.class) {
        if ((getSecureMethod = TestServiceGrpc.getSecureMethod) == null) {
          TestServiceGrpc.getSecureMethod = getSecureMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, net.devh.test.grpc.proto.SomeType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TestService", "secure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.devh.test.grpc.proto.SomeType.getDefaultInstance()))
                  .setSchemaDescriptor(new TestServiceMethodDescriptorSupplier("secure"))
                  .build();
          }
        }
     }
     return getSecureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestServiceStub newStub(io.grpc.Channel channel) {
    return new TestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TestServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Returns version information
     * </pre>
     */
    public void normal(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType> responseObserver) {
      asyncUnimplementedUnaryCall(getNormalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unimplemented method
     * </pre>
     */
    public void unimplemented(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType> responseObserver) {
      asyncUnimplementedUnaryCall(getUnimplementedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Secured method
     * </pre>
     */
    public void secure(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType> responseObserver) {
      asyncUnimplementedUnaryCall(getSecureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNormalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                net.devh.test.grpc.proto.SomeType>(
                  this, METHODID_NORMAL)))
          .addMethod(
            getUnimplementedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                net.devh.test.grpc.proto.SomeType>(
                  this, METHODID_UNIMPLEMENTED)))
          .addMethod(
            getSecureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                net.devh.test.grpc.proto.SomeType>(
                  this, METHODID_SECURE)))
          .build();
    }
  }

  /**
   */
  public static final class TestServiceStub extends io.grpc.stub.AbstractStub<TestServiceStub> {
    private TestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns version information
     * </pre>
     */
    public void normal(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNormalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unimplemented method
     * </pre>
     */
    public void unimplemented(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnimplementedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Secured method
     * </pre>
     */
    public void secure(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSecureMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TestServiceBlockingStub extends io.grpc.stub.AbstractStub<TestServiceBlockingStub> {
    private TestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns version information
     * </pre>
     */
    public net.devh.test.grpc.proto.SomeType normal(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getNormalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unimplemented method
     * </pre>
     */
    public net.devh.test.grpc.proto.SomeType unimplemented(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getUnimplementedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Secured method
     * </pre>
     */
    public net.devh.test.grpc.proto.SomeType secure(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getSecureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TestServiceFutureStub extends io.grpc.stub.AbstractStub<TestServiceFutureStub> {
    private TestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Returns version information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.test.grpc.proto.SomeType> normal(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getNormalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unimplemented method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.test.grpc.proto.SomeType> unimplemented(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getUnimplementedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Secured method
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<net.devh.test.grpc.proto.SomeType> secure(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getSecureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NORMAL = 0;
  private static final int METHODID_UNIMPLEMENTED = 1;
  private static final int METHODID_SECURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NORMAL:
          serviceImpl.normal((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType>) responseObserver);
          break;
        case METHODID_UNIMPLEMENTED:
          serviceImpl.unimplemented((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType>) responseObserver);
          break;
        case METHODID_SECURE:
          serviceImpl.secure((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<net.devh.test.grpc.proto.SomeType>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.devh.test.grpc.proto.TestServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestService");
    }
  }

  private static final class TestServiceFileDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier {
    TestServiceFileDescriptorSupplier() {}
  }

  private static final class TestServiceMethodDescriptorSupplier
      extends TestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestServiceFileDescriptorSupplier())
              .addMethod(getNormalMethod())
              .addMethod(getUnimplementedMethod())
              .addMethod(getSecureMethod())
              .build();
        }
      }
    }
    return result;
  }
}

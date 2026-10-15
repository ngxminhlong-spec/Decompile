package O3;

import S3.e;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f1469a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        e.b(methods);
        int length = methods.length;
        int i4 = 0;
        while (true) {
            method = null;
            if (i4 >= length) {
                break;
            }
            Method method2 = methods[i4];
            if (e.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                e.d(parameterTypes, "getParameterTypes(...)");
                if (e.a(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i4++;
        }
        f1469a = method;
        int length2 = methods.length;
        for (int i5 = 0; i5 < length2 && !e.a(methods[i5].getName(), "getSuppressed"); i5++) {
        }
    }
}

package Y3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f2226a;

    static {
        try {
            Iterator it = Arrays.asList(new X3.b()).iterator();
            S3.e.e(it, "<this>");
            f2226a = U3.c.K(new U3.a(new U3.e(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

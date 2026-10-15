package m2;

import android.content.Context;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f14054b;

    /* renamed from: a, reason: collision with root package name */
    public b f14055a;

    /* JADX WARN: Type inference failed for: r0v0, types: [m2.c, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f14055a = null;
        f14054b = obj;
    }

    public static b a(Context context) {
        b bVar;
        c cVar = f14054b;
        synchronized (cVar) {
            try {
                if (cVar.f14055a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f14055a = new b(context, 0);
                }
                bVar = cVar.f14055a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}

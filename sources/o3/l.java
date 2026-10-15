package o3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: o, reason: collision with root package name */
    public static final l f14370o;

    /* renamed from: p, reason: collision with root package name */
    public static final Handler f14371p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ l[] f14372q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o3.l, java.lang.Enum] */
    static {
        ?? r02 = new Enum("INSTANCE", 0);
        f14370o = r02;
        f14372q = new l[]{r02};
        f14371p = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f14372q.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f14371p.post(runnable);
    }
}

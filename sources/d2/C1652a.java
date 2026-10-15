package d2;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: d2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1652a {
    public static final ReentrantLock c = new ReentrantLock();
    public static C1652a d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f12600a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f12601b;

    public C1652a(Context context) {
        this.f12601b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        ReentrantLock reentrantLock = this.f12600a;
        reentrantLock.lock();
        try {
            return this.f12601b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}

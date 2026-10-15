package c0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import h0.C1694b;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0227h {

    /* renamed from: a, reason: collision with root package name */
    public volatile C1694b f3524a;

    /* renamed from: b, reason: collision with root package name */
    public Executor f3525b;
    public g0.b c;
    public final C0223d d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3526e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3527f;

    /* renamed from: g, reason: collision with root package name */
    public List f3528g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantReadWriteLock f3529h = new ReentrantReadWriteLock();

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f3530i = new ThreadLocal();

    public AbstractC0227h() {
        new ConcurrentHashMap();
        this.d = d();
    }

    public final void a() {
        if (!this.f3526e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!((SQLiteDatabase) this.c.c().f13103p).inTransaction() && this.f3530i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        C1694b c = this.c.c();
        this.d.c(c);
        c.a();
    }

    public abstract C0223d d();

    public abstract g0.b e(C0220a c0220a);

    public final void f() {
        this.c.c().g();
        if (((SQLiteDatabase) this.c.c().f13103p).inTransaction()) {
            return;
        }
        C0223d c0223d = this.d;
        if (c0223d.d.compareAndSet(false, true)) {
            c0223d.c.f3525b.execute(c0223d.f3511i);
        }
    }

    public final Cursor g(g0.c cVar) {
        a();
        b();
        return this.c.c().i(cVar);
    }

    public final void h() {
        this.c.c().k();
    }
}

package c0;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: c0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0231l {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f3542a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0227h f3543b;
    public volatile h0.f c;

    public AbstractC0231l(AbstractC0227h abstractC0227h) {
        this.f3543b = abstractC0227h;
    }

    public final h0.f a() {
        this.f3543b.a();
        if (!this.f3542a.compareAndSet(false, true)) {
            String b4 = b();
            AbstractC0227h abstractC0227h = this.f3543b;
            abstractC0227h.a();
            abstractC0227h.b();
            return new h0.f(((SQLiteDatabase) abstractC0227h.c.c().f13103p).compileStatement(b4));
        }
        if (this.c == null) {
            String b5 = b();
            AbstractC0227h abstractC0227h2 = this.f3543b;
            abstractC0227h2.a();
            abstractC0227h2.b();
            this.c = new h0.f(((SQLiteDatabase) abstractC0227h2.c.c().f13103p).compileStatement(b5));
        }
        return this.c;
    }

    public abstract String b();

    public final void c(h0.f fVar) {
        if (fVar == this.c) {
            this.f3542a.set(false);
        }
    }
}

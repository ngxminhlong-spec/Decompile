package x2;

import Q1.AbstractC0115n;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2076h0 extends AbstractC0115n {

    /* renamed from: b, reason: collision with root package name */
    public boolean f15673b;

    public AbstractC2076h0(C2066c0 c2066c0) {
        super(c2066c0);
        ((C2066c0) this.f1719a).f15559E++;
    }

    public abstract boolean h();

    public final void i() {
        if (!this.f15673b) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void j() {
        if (this.f15673b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (h()) {
            return;
        }
        ((C2066c0) this.f1719a).a();
        this.f15673b = true;
    }
}

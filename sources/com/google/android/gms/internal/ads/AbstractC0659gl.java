package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.gl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0659gl implements InterfaceC0403al {

    /* renamed from: b, reason: collision with root package name */
    public Fk f8859b;
    public Fk c;
    public Fk d;

    /* renamed from: e, reason: collision with root package name */
    public Fk f8860e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f8861f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f8862g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8863h;

    public AbstractC0659gl() {
        ByteBuffer byteBuffer = InterfaceC0403al.f8159a;
        this.f8861f = byteBuffer;
        this.f8862g = byteBuffer;
        Fk fk = Fk.f5070e;
        this.d = fk;
        this.f8860e = fk;
        this.f8859b = fk;
        this.c = fk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final Fk b(Fk fk) {
        this.d = fk;
        this.f8860e = g(fk);
        return h() ? this.f8860e : Fk.f5070e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.f8862g;
        this.f8862g = InterfaceC0403al.f8159a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void d() {
        e();
        this.f8861f = InterfaceC0403al.f8159a;
        Fk fk = Fk.f5070e;
        this.d = fk;
        this.f8860e = fk;
        this.f8859b = fk;
        this.c = fk;
        m();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void e() {
        this.f8862g = InterfaceC0403al.f8159a;
        this.f8863h = false;
        this.f8859b = this.d;
        this.c = this.f8860e;
        k();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public boolean f() {
        return this.f8863h && this.f8862g == InterfaceC0403al.f8159a;
    }

    public abstract Fk g(Fk fk);

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public boolean h() {
        return this.f8860e != Fk.f5070e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void i() {
        this.f8863h = true;
        l();
    }

    public final ByteBuffer j(int i4) {
        if (this.f8861f.capacity() < i4) {
            this.f8861f = ByteBuffer.allocateDirect(i4).order(ByteOrder.nativeOrder());
        } else {
            this.f8861f.clear();
        }
        ByteBuffer byteBuffer = this.f8861f;
        this.f8862g = byteBuffer;
        return byteBuffer;
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }
}

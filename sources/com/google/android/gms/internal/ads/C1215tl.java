package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.tl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1215tl implements InterfaceC0403al {

    /* renamed from: b, reason: collision with root package name */
    public int f10723b;
    public float c;
    public float d;

    /* renamed from: e, reason: collision with root package name */
    public Fk f10724e;

    /* renamed from: f, reason: collision with root package name */
    public Fk f10725f;

    /* renamed from: g, reason: collision with root package name */
    public Fk f10726g;

    /* renamed from: h, reason: collision with root package name */
    public Fk f10727h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10728i;

    /* renamed from: j, reason: collision with root package name */
    public C1129rl f10729j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f10730k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f10731l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f10732m;

    /* renamed from: n, reason: collision with root package name */
    public long f10733n;

    /* renamed from: o, reason: collision with root package name */
    public long f10734o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10735p;

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C1129rl c1129rl = this.f10729j;
            c1129rl.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f10733n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i4 = c1129rl.f10502b;
            int i5 = remaining2 / i4;
            int i6 = i5 * i4;
            short[] f4 = c1129rl.f(c1129rl.f10508j, c1129rl.f10509k, i5);
            c1129rl.f10508j = f4;
            asShortBuffer.get(f4, c1129rl.f10509k * i4, (i6 + i6) / 2);
            c1129rl.f10509k += i5;
            c1129rl.e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final Fk b(Fk fk) {
        if (fk.c != 2) {
            throw new Sk(fk);
        }
        int i4 = this.f10723b;
        if (i4 == -1) {
            i4 = fk.f5071a;
        }
        this.f10724e = fk;
        Fk fk2 = new Fk(i4, fk.f5072b, 2);
        this.f10725f = fk2;
        this.f10728i = true;
        return fk2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final ByteBuffer c() {
        int i4;
        int i5;
        int i6;
        C1129rl c1129rl = this.f10729j;
        if (c1129rl != null && (i6 = (i5 = c1129rl.f10511m * (i4 = c1129rl.f10502b)) + i5) > 0) {
            if (this.f10730k.capacity() < i6) {
                ByteBuffer order = ByteBuffer.allocateDirect(i6).order(ByteOrder.nativeOrder());
                this.f10730k = order;
                this.f10731l = order.asShortBuffer();
            } else {
                this.f10730k.clear();
                this.f10731l.clear();
            }
            ShortBuffer shortBuffer = this.f10731l;
            int min = Math.min(shortBuffer.remaining() / i4, c1129rl.f10511m);
            int i7 = min * i4;
            shortBuffer.put(c1129rl.f10510l, 0, i7);
            int i8 = c1129rl.f10511m - min;
            c1129rl.f10511m = i8;
            short[] sArr = c1129rl.f10510l;
            System.arraycopy(sArr, i7, sArr, 0, i8 * i4);
            this.f10734o += i6;
            this.f10730k.limit(i6);
            this.f10732m = this.f10730k;
        }
        ByteBuffer byteBuffer = this.f10732m;
        this.f10732m = InterfaceC0403al.f8159a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void d() {
        this.c = 1.0f;
        this.d = 1.0f;
        Fk fk = Fk.f5070e;
        this.f10724e = fk;
        this.f10725f = fk;
        this.f10726g = fk;
        this.f10727h = fk;
        ByteBuffer byteBuffer = InterfaceC0403al.f8159a;
        this.f10730k = byteBuffer;
        this.f10731l = byteBuffer.asShortBuffer();
        this.f10732m = byteBuffer;
        this.f10723b = -1;
        this.f10728i = false;
        this.f10729j = null;
        this.f10733n = 0L;
        this.f10734o = 0L;
        this.f10735p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void e() {
        if (h()) {
            Fk fk = this.f10724e;
            this.f10726g = fk;
            Fk fk2 = this.f10725f;
            this.f10727h = fk2;
            if (this.f10728i) {
                this.f10729j = new C1129rl(fk.f5071a, fk.f5072b, this.c, this.d, fk2.f5071a);
            } else {
                C1129rl c1129rl = this.f10729j;
                if (c1129rl != null) {
                    c1129rl.f10509k = 0;
                    c1129rl.f10511m = 0;
                    c1129rl.f10513o = 0;
                    c1129rl.f10514p = 0;
                    c1129rl.f10515q = 0;
                    c1129rl.f10516r = 0;
                    c1129rl.f10517s = 0;
                    c1129rl.f10518t = 0;
                    c1129rl.f10519u = 0;
                    c1129rl.f10520v = 0;
                }
            }
        }
        this.f10732m = InterfaceC0403al.f8159a;
        this.f10733n = 0L;
        this.f10734o = 0L;
        this.f10735p = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final boolean f() {
        if (!this.f10735p) {
            return false;
        }
        C1129rl c1129rl = this.f10729j;
        if (c1129rl == null) {
            return true;
        }
        int i4 = c1129rl.f10511m * c1129rl.f10502b;
        return i4 + i4 == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final boolean h() {
        if (this.f10725f.f5071a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f10725f.f5071a != this.f10724e.f5071a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0403al
    public final void i() {
        C1129rl c1129rl = this.f10729j;
        if (c1129rl != null) {
            int i4 = c1129rl.f10509k;
            int i5 = c1129rl.f10511m;
            float f4 = c1129rl.f10513o;
            float f5 = c1129rl.c;
            float f6 = c1129rl.f10503e;
            float f7 = c1129rl.d;
            int i6 = i5 + ((int) ((((i4 / (f5 / f7)) + f4) / (f6 * f7)) + 0.5f));
            int i7 = c1129rl.f10506h;
            int i8 = i7 + i7;
            c1129rl.f10508j = c1129rl.f(c1129rl.f10508j, i4, i8 + i4);
            int i9 = 0;
            while (true) {
                int i10 = c1129rl.f10502b;
                if (i9 >= i8 * i10) {
                    break;
                }
                c1129rl.f10508j[(i10 * i4) + i9] = 0;
                i9++;
            }
            c1129rl.f10509k += i8;
            c1129rl.e();
            if (c1129rl.f10511m > i6) {
                c1129rl.f10511m = i6;
            }
            c1129rl.f10509k = 0;
            c1129rl.f10516r = 0;
            c1129rl.f10513o = 0;
        }
        this.f10735p = true;
    }
}

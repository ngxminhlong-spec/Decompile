package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.AEADBadTagException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0287Ic {

    /* renamed from: a, reason: collision with root package name */
    public Object f5574a;

    /* renamed from: b, reason: collision with root package name */
    public Object f5575b;

    public AbstractC0287Ic() {
        C0272Fc c0272Fc = new C0272Fc();
        this.f5574a = c0272Fc;
        this.f5575b = new AtomicInteger(0);
        M3 m32 = new M3(19, this);
        c0272Fc.a(new Nu(0, c0272Fc, m32), AbstractC0266Ec.f4900f);
    }

    public AbstractC0287Ic(C0258Da c0258Da, Q1.K k3) {
        this.f5575b = c0258Da;
        this.f5574a = k3;
    }

    public AbstractC0287Ic(f.q qVar) {
        this.f5575b = qVar;
    }

    public /* synthetic */ AbstractC0287Ic(Object obj) {
        this.f5574a = obj;
    }

    public void c() {
        Q1.E e4 = (Q1.E) this.f5574a;
        if (e4 != null) {
            try {
                ((f.q) this.f5575b).f12909s.unregisterReceiver(e4);
            } catch (IllegalArgumentException unused) {
            }
            this.f5574a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof C.a)) {
            return menuItem;
        }
        C.a aVar = (C.a) menuItem;
        if (((r.e) this.f5575b) == null) {
            this.f5575b = new r.i(0);
        }
        MenuItem menuItem2 = (MenuItem) ((r.e) this.f5575b).get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k.u uVar = new k.u((Context) this.f5574a, aVar);
        ((r.e) this.f5575b).put(aVar, uVar);
        return uVar;
    }

    public abstract Object g(IBinder iBinder);

    public Object h(Context context) {
        Context context2;
        if (this.f5575b == null) {
            h2.y.i(context);
            AtomicBoolean atomicBoolean = e2.h.f12754a;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                throw new Exception("Could not get remote context.");
            }
            try {
                this.f5575b = g((IBinder) context2.getClassLoader().loadClass((String) this.f5574a).newInstance());
            } catch (ClassNotFoundException e4) {
                throw new Exception("Could not load creator class.", e4);
            } catch (IllegalAccessException e5) {
                throw new Exception("Could not access creator.", e5);
            } catch (InstantiationException e6) {
                throw new Exception("Could not instantiate creator.", e6);
            }
        }
        return this.f5575b;
    }

    public abstract void i();

    public void j() {
        c();
        IntentFilter d = d();
        if (d.countActions() == 0) {
            return;
        }
        if (((Q1.E) this.f5574a) == null) {
            this.f5574a = new Q1.E(6, this);
        }
        ((f.q) this.f5575b).f12909s.registerReceiver((Q1.E) this.f5574a, d);
    }

    public abstract AbstractC1012ow k(int i4, byte[] bArr);

    public byte[] l(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((AbstractC1012ow) this.f5575b).j(0, bArr).get(bArr4);
            int length = bArr2.length;
            int i4 = length & 15;
            int i5 = i4 == 0 ? length : (length + 16) - i4;
            int remaining = byteBuffer.remaining();
            int i6 = remaining % 16;
            int i7 = (i6 == 0 ? remaining : (remaining + 16) - i6) + i5;
            ByteBuffer order = ByteBuffer.allocate(i7 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(i5);
            order.put(byteBuffer);
            order.position(i7);
            order.putLong(length);
            order.putLong(remaining);
            if (!MessageDigest.isEqual(Bs.u(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            AbstractC1012ow abstractC1012ow = (AbstractC1012ow) this.f5574a;
            abstractC1012ow.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            if (bArr.length != abstractC1012ow.f()) {
                throw new GeneralSecurityException(U.a.i("The nonce length (in bytes) must be ", abstractC1012ow.f()));
            }
            int remaining2 = byteBuffer.remaining();
            int i8 = remaining2 / 64;
            for (int i9 = 0; i9 < i8 + 1; i9++) {
                ByteBuffer j4 = abstractC1012ow.j(abstractC1012ow.f9864a + i9, bArr);
                if (i9 == i8) {
                    Bs.p(allocate, byteBuffer, j4, remaining2 % 64);
                } else {
                    Bs.p(allocate, byteBuffer, j4, 64);
                }
            }
            return allocate.array();
        } catch (GeneralSecurityException e4) {
            throw new AEADBadTagException(e4.toString());
        }
    }

    public void m(InterfaceC0282Hc interfaceC0282Hc, InterfaceC0277Gc interfaceC0277Gc) {
        C0783ji c0783ji = new C0783ji(20, interfaceC0282Hc, interfaceC0277Gc);
        C0272Fc c0272Fc = (C0272Fc) this.f5574a;
        c0272Fc.a(new Nu(0, c0272Fc, c0783ji), AbstractC0266Ec.f4900f);
    }
}

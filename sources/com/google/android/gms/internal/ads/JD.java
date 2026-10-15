package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class JD extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5797a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Object f5798b;

    public /* synthetic */ JD() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JD(LD ld, Looper looper) {
        super(looper);
        this.f5798b = ld;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        KD kd;
        switch (this.f5797a) {
            case 0:
                LD ld = (LD) this.f5798b;
                int i4 = message.what;
                if (i4 == 0) {
                    kd = (KD) message.obj;
                    try {
                        ld.f6138a.queueInputBuffer(kd.f5996a, 0, kd.f5997b, kd.d, kd.f5998e);
                    } catch (RuntimeException e4) {
                        AbstractC0587ez.h(ld.d, e4);
                    }
                } else if (i4 != 1) {
                    kd = null;
                    if (i4 != 2) {
                        AbstractC0587ez.h(ld.d, new IllegalStateException(String.valueOf(message.what)));
                    } else {
                        ld.f6140e.c();
                    }
                } else {
                    kd = (KD) message.obj;
                    int i5 = kd.f5996a;
                    MediaCodec.CryptoInfo cryptoInfo = kd.c;
                    long j4 = kd.d;
                    int i6 = kd.f5998e;
                    try {
                        synchronized (LD.f6137h) {
                            ld.f6138a.queueSecureInputBuffer(i5, 0, cryptoInfo, j4, i6);
                        }
                    } catch (RuntimeException e5) {
                        AbstractC0587ez.h(ld.d, e5);
                    }
                }
                if (kd != null) {
                    ArrayDeque arrayDeque = LD.f6136g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(kd);
                    }
                    return;
                }
                return;
            default:
                int i7 = message.what;
                if (i7 == -3 || i7 == -2 || i7 == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f5798b).get(), message.what);
                    return;
                } else {
                    if (i7 != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
        }
    }
}

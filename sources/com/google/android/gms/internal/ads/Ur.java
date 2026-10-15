package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class Ur extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7202a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ur(Looper looper, int i4) {
        super(looper);
        this.f7202a = i4;
        switch (i4) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                return;
            case 3:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ur(Looper looper, int i4, boolean z4) {
        super(looper);
        this.f7202a = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Ur(Looper looper, Handler.Callback callback, int i4) {
        super(looper, callback);
        this.f7202a = i4;
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        switch (this.f7202a) {
            case 0:
                a(message);
                return;
            default:
                super.dispatchMessage(message);
                return;
        }
    }
}

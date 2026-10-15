package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.am, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnCancelListenerC0404am implements DialogInterface.OnCancelListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8160o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BinderC0489cm f8161p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P1.a f8162q;

    public /* synthetic */ DialogInterfaceOnCancelListenerC0404am(BinderC0489cm binderC0489cm, P1.a aVar, int i4) {
        this.f8160o = i4;
        this.f8161p = binderC0489cm;
        this.f8162q = aVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f8160o) {
            case 0:
                BinderC0489cm binderC0489cm = this.f8161p;
                binderC0489cm.f8403r.a(binderC0489cm.f8405t);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC0489cm.N3(binderC0489cm.f8405t, "rtsdc", hashMap);
                P1.a aVar = this.f8162q;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            default:
                BinderC0489cm binderC0489cm2 = this.f8161p;
                binderC0489cm2.f8403r.a(binderC0489cm2.f8405t);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC0489cm2.N3(binderC0489cm2.f8405t, "dialog_click", hashMap2);
                P1.a aVar2 = this.f8162q;
                if (aVar2 != null) {
                    aVar2.c();
                    return;
                }
                return;
        }
    }
}

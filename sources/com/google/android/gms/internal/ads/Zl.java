package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.HashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class Zl implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8030o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ BinderC0489cm f8031p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ P1.a f8032q;

    public /* synthetic */ Zl(BinderC0489cm binderC0489cm, P1.a aVar, int i4) {
        this.f8030o = i4;
        this.f8031p = binderC0489cm;
        this.f8032q = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f8030o) {
            case 0:
                BinderC0489cm binderC0489cm = this.f8031p;
                binderC0489cm.f8403r.a(binderC0489cm.f8405t);
                HashMap hashMap = new HashMap();
                hashMap.put("dialog_action", "dismiss");
                binderC0489cm.N3(binderC0489cm.f8405t, "rtsdc", hashMap);
                P1.a aVar = this.f8032q;
                if (aVar != null) {
                    aVar.c();
                    return;
                }
                return;
            default:
                BinderC0489cm binderC0489cm2 = this.f8031p;
                binderC0489cm2.f8403r.a(binderC0489cm2.f8405t);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("dialog_action", "dismiss");
                binderC0489cm2.N3(binderC0489cm2.f8405t, "dialog_click", hashMap2);
                P1.a aVar2 = this.f8032q;
                if (aVar2 != null) {
                    aVar2.c();
                    return;
                }
                return;
        }
    }
}

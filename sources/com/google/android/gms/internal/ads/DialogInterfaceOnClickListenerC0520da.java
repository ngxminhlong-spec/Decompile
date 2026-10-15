package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import android.provider.CalendarContract;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.da, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0520da implements DialogInterface.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8485o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0562ea f8486p;

    public /* synthetic */ DialogInterfaceOnClickListenerC0520da(C0562ea c0562ea, int i4) {
        this.f8485o = i4;
        this.f8486p = c0562ea;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        switch (this.f8485o) {
            case 0:
                Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
                C0562ea c0562ea = this.f8486p;
                data.putExtra("title", c0562ea.f8611u);
                data.putExtra("eventLocation", c0562ea.y);
                data.putExtra("description", c0562ea.f8614x);
                long j4 = c0562ea.f8612v;
                if (j4 > -1) {
                    data.putExtra("beginTime", j4);
                }
                long j5 = c0562ea.f8613w;
                if (j5 > -1) {
                    data.putExtra("endTime", j5);
                }
                data.setFlags(268435456);
                Q1.N n4 = N1.n.f1204A.c;
                Q1.N.o(c0562ea.f8610t, data);
                return;
            default:
                this.f8486p.G("Operation denied by user.");
                return;
        }
    }
}

package C0;

import O1.C0077n;
import android.content.Context;
import android.os.AsyncTask;
import com.duracodefactory.logiccircuitsimulatorpro.ui.UploaderLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import m2.AbstractC1806a;
import o1.C1881r;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class m0 extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    /* renamed from: b, reason: collision with root package name */
    public Context f347b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(H h4, int i4) {
        this.f346a = i4;
        this.c = h4;
    }

    public m0(UploaderLayout uploaderLayout, Context context) {
        this.f346a = 2;
        this.c = uploaderLayout;
        this.f347b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i4;
        File file;
        String[] list;
        File file2;
        File file3;
        switch (this.f346a) {
            case 0:
                v0 v0Var = (v0) this.c;
                AbstractC1806a.m(this.f347b);
                ArrayList arrayList = new ArrayList();
                try {
                    Context l4 = v0Var.l();
                    File file4 = new File(i1.c.g(l4));
                    if (file4.exists() && (list = file4.list()) != null) {
                        for (String str : list) {
                            if (str.startsWith(".")) {
                                i1.c.e(l4, str.substring(1));
                            }
                        }
                    }
                    file = new File(i1.c.g(v0Var.l()));
                } catch (Throwable unused) {
                }
                if (!file.exists()) {
                    throw new Throwable();
                }
                String[] list2 = file.list();
                if (list2 == null) {
                    throw new Throwable();
                }
                for (String str2 : list2) {
                    if (!str2.startsWith(".")) {
                        try {
                            arrayList.add(i1.c.e(v0Var.l(), str2));
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return arrayList;
            case 1:
                AbstractC1806a.m(this.f347b);
                ArrayList arrayList2 = new ArrayList();
                try {
                    file2 = new File(i1.c.g(((D0.p) this.c).l()));
                } catch (Throwable unused3) {
                }
                if (!file2.exists()) {
                    throw new Throwable();
                }
                String[] list3 = file2.list();
                if (list3 == null) {
                    throw new Throwable();
                }
                for (String str3 : list3) {
                    try {
                        arrayList2.add(i1.c.b(new File(file2 + "/" + str3), str3));
                    } catch (Throwable unused4) {
                    }
                }
                return arrayList2;
            default:
                Context context = this.f347b;
                ArrayList arrayList3 = new ArrayList();
                try {
                    file3 = new File(i1.c.g(context));
                } catch (Throwable unused5) {
                }
                if (!file3.exists()) {
                    throw new Throwable();
                }
                String[] list4 = file3.list();
                if (list4 == null) {
                    throw new Throwable();
                }
                for (String str4 : list4) {
                    if (!str4.startsWith(".")) {
                        try {
                            arrayList3.add(i1.c.e(context, str4));
                        } catch (Throwable unused6) {
                        }
                    }
                }
                return arrayList3;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        switch (this.f346a) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                v0 v0Var = (v0) this.c;
                if (v0Var.h() == null) {
                    return;
                }
                v0Var.f429k0.removeCallbacks(v0Var.f423H0);
                v0Var.f429k0.setVisibility(8);
                l0 l0Var = v0Var.f427i0;
                j0 j0Var = (j0) l0Var.f342f;
                j0Var.d = arrayList;
                Collections.sort(arrayList, new i0(0));
                j0Var.d();
                C0077n.c(((v0) l0Var.f343g).f431m0);
                l0Var.d();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj2 = arrayList.get(i4);
                    i4++;
                    int i5 = ((i1.d) obj2).f13267k;
                    if (i5 != 0) {
                        l1.f.f13951e.f13956b.add(Integer.valueOf(i5));
                    }
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj;
                D0.p pVar = (D0.p) this.c;
                if (pVar.h() == null) {
                    return;
                }
                pVar.f621j0.removeCallbacks(pVar.f616C0);
                pVar.f621j0.setVisibility(8);
                l0 l0Var2 = pVar.f619h0;
                j0 j0Var2 = (j0) l0Var2.f342f;
                j0Var2.d = arrayList2;
                Collections.sort(arrayList2, new i0(1));
                j0Var2.d();
                C0077n.b(((D0.p) l0Var2.f343g).f623l0);
                l0Var2.e();
                return;
            default:
                ArrayList arrayList3 = (ArrayList) obj;
                UploaderLayout uploaderLayout = (UploaderLayout) this.c;
                uploaderLayout.f3789o.removeCallbacks(uploaderLayout.f3794t);
                uploaderLayout.f3794t = null;
                uploaderLayout.f3789o.setVisibility(8);
                C1881r c1881r = uploaderLayout.f3791q;
                c1881r.d = arrayList3;
                Collections.sort(arrayList3, new i0(6));
                c1881r.d();
                if (arrayList3.isEmpty()) {
                    uploaderLayout.f3790p.setVisibility(0);
                    return;
                }
                return;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        switch (this.f346a) {
            case 0:
                v0 v0Var = (v0) this.c;
                this.f347b = v0Var.f426h0.getContext();
                v0Var.f429k0.postDelayed(v0Var.f423H0, 3000L);
                return;
            case 1:
                D0.p pVar = (D0.p) this.c;
                this.f347b = pVar.f618g0.getContext();
                pVar.f621j0.postDelayed(pVar.f616C0, 3000L);
                return;
            default:
                UploaderLayout uploaderLayout = (UploaderLayout) this.c;
                uploaderLayout.f3789o.postDelayed(uploaderLayout.f3794t, 2000L);
                return;
        }
    }
}

package org.dom4j.swing;

import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;
import org.dom4j.Branch;
import org.dom4j.Node;

/* JADX INFO: loaded from: classes2.dex */
public class BranchTreeNode extends LeafTreeNode {

    /* JADX INFO: renamed from: d */
    public List f16793d;

    /* JADX INFO: renamed from: org.dom4j.swing.BranchTreeNode$1 */
    class C50611 implements Enumeration {

        /* JADX INFO: renamed from: a */
        public int f16794a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BranchTreeNode f16795b;

        /* JADX WARN: Invalid debug info offset */
        public C50611(BranchTreeNode branchTreeNode) {
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return false;
        }

        /* JADX WARN: Invalid debug info offset */
        @Override // java.util.Enumeration
        public Object nextElement() {
            return null;
        }
    }

    /* JADX WARN: Invalid debug info offset */
    public BranchTreeNode() {
    }

    /* JADX WARN: Invalid debug info offset */
    public BranchTreeNode(TreeNode treeNode, Branch branch) {
    }

    /* JADX WARN: Invalid debug info offset */
    public BranchTreeNode(Branch branch) {
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.swing.LeafTreeNode
    /* JADX INFO: renamed from: a */
    public Enumeration mo24617a() {
        return null;
    }

    @Override // org.dom4j.swing.LeafTreeNode
    /* JADX INFO: renamed from: b */
    public boolean mo24618b() {
        return true;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.swing.LeafTreeNode
    /* JADX INFO: renamed from: c */
    public TreeNode mo24619c(int i) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.swing.LeafTreeNode
    /* JADX INFO: renamed from: d */
    public int mo24620d() {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.swing.LeafTreeNode
    /* JADX INFO: renamed from: e */
    public int mo24621e(TreeNode treeNode) {
        return 0;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.swing.LeafTreeNode
    /* JADX INFO: renamed from: h */
    public boolean mo24622h() {
        return false;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: j */
    public List m24623j() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: k */
    public TreeNode m24624k(Node node) {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: l */
    public List m24625l() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    /* JADX INFO: renamed from: m */
    public Branch m24626m() {
        return null;
    }

    /* JADX WARN: Invalid debug info offset */
    @Override // org.dom4j.swing.LeafTreeNode
    public String toString() {
        return null;
    }
}
